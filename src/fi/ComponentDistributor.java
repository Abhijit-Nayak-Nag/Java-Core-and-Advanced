package fi;

import java.util.*;

public class ComponentDistributor {
    static class Component {
        int weight;
        int complexity;
        Set<Integer> compatibleLines;

//       static int a=5;
//       static int b= 22;

        Component(int weight, int complexity, Set<Integer> compatibleLines) {
            this.weight = weight;
            this.complexity = complexity;
            this.compatibleLines = compatibleLines;
        }
    }

    static class AssemblyLine {
        int id;
        int capacity;
        int currentLoad;

        AssemblyLine(int id, int capacity) {
            this.id = id;
            this.capacity = capacity;
            this.currentLoad = 0;
        }

        int remainingCapacity() {
            return capacity - currentLoad;
        }

        void addLoad(int load) {
            this.currentLoad += load;
        }
    }

    public static int optimizeComponentDistribution(List<Component> components, List<Integer> lineCapacities) {
        List<AssemblyLine> assemblyLines = new ArrayList<>();
        for (int i = 0; i < lineCapacities.size(); i++) {
            assemblyLines.add(new AssemblyLine(i, lineCapacities.get(i)));
        }

        int totalCost = 0;

        for (Component component : components) {
            totalCost += distributeComponent(component, assemblyLines);
        }

        return totalCost;
    }

    private static int distributeComponent(Component component, List<AssemblyLine> assemblyLines) {
        PriorityQueue<AssemblyLine> pq = new PriorityQueue<>(Comparator.comparingInt(AssemblyLine::remainingCapacity));

        for (int lineId : component.compatibleLines) {
            pq.offer(assemblyLines.get(lineId));
        }

        int remainingWeight = component.weight;
        int cost = 0;

        while (!pq.isEmpty() && remainingWeight > 0) {
            AssemblyLine line = pq.poll();
            int space = line.remainingCapacity();
            if (space > 0) {
                int weightToAssign = Math.min(space, remainingWeight);
                line.addLoad(weightToAssign);
                remainingWeight -= weightToAssign;
                if (remainingWeight > 0) {
                    cost += weightToAssign * component.complexity; // Cost for splitting
                }
            }
        }

        if (remainingWeight > 0) {
            // If we can't place the entire weight within the compatible lines, this indicates an issue with the input constraints
            throw new IllegalStateException("Not enough capacity to handle the component distribution.");
        }

        return cost;
    }

    public static void main(String[] args) {
        List<Component> components = Arrays.asList(
                new Component(10, 2, new HashSet<>(Arrays.asList(0))),
                new Component(5, 1, new HashSet<>(Arrays.asList(0))),
                new Component(8, 3, new HashSet<>(Arrays.asList(0)))
        );
        List<Integer> lineCapacities = Arrays.asList(100);
        System.out.println(optimizeComponentDistribution(components, lineCapacities)); // Output: 0

        components = Arrays.asList(
                new Component(10, 2, new HashSet<>(Arrays.asList(0, 1))),
                new Component(5, 1, new HashSet<>(Arrays.asList(1))),
                new Component(8, 3, new HashSet<>(Arrays.asList(0)))
        );
        lineCapacities = Arrays.asList(20, 20);
        System.out.println(optimizeComponentDistribution(components, lineCapacities)); // Output: 5

        components = Arrays.asList(
                new Component(15, 4, new HashSet<>(Arrays.asList(0, 1))),
                new Component(10, 2, new HashSet<>(Arrays.asList(0, 1))),
                new Component(5, 1, new HashSet<>(Arrays.asList(0, 1)))
        );
        lineCapacities = Arrays.asList(20, 20);
        System.out.println(optimizeComponentDistribution(components, lineCapacities)); // Output: 10

        components = Arrays.asList(
                new Component(10, 2, new HashSet<>(Arrays.asList(0, 2))),
                new Component(5, 1, new HashSet<>(Arrays.asList(1, 3))),
                new Component(8, 3, new HashSet<>(Arrays.asList(2, 3))),
                new Component(12, 4, new HashSet<>(Arrays.asList(0, 1)))
        );
        lineCapacities = Arrays.asList(20, 20, 20, 20);
        System.out.println(optimizeComponentDistribution(components, lineCapacities)); // Output: 18
    }
}

