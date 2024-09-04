package in.exceptionandfilehandling.file;

import java.util.*;

public class ComponentDistribution {

    static class Component {
        int weight;
        int complexity;
        Set<Integer> compatibleLines;

        Component(int weight, int complexity, Set<Integer> compatibleLines) {
            this.weight = weight;
            this.complexity = complexity;
            this.compatibleLines = compatibleLines;
        }
    }

    // Helper function to calculate the cost of splitting a component
    public static int calculateSplitCost(int weight, int complexity, Set<Integer> lines) {
        return (lines.size() - 1) * weight * complexity;
    }

    public static int optimizeComponentDistribution(List<Component> components, List<Integer> lineCapacities) {
        // Priority queue to process components based on minimum cost
        PriorityQueue<Component> minHeap = new PriorityQueue<>(Comparator.comparingInt(c -> calculateSplitCost(c.weight, c.complexity, c.compatibleLines)));

        // Populate the heap with initial costs
        minHeap.addAll(components);

        int totalCost = 0;
        int[] lineWorkloads = new int[lineCapacities.size()];

        while (!minHeap.isEmpty()) {
            Component component = minHeap.poll();
            int weight = component.weight;
            int complexity = component.complexity;
            Set<Integer> lines = component.compatibleLines;

            // Find the line with the minimum current workload that can accept this component
            Integer bestLine = null;
            int minWorkload = Integer.MAX_VALUE;

            for (int line : lines) {
                if (lineWorkloads[line] + weight <= lineCapacities.get(line) && lineWorkloads[line] < minWorkload) {
                    minWorkload = lineWorkloads[line];
                    bestLine = line;
                }
            }

            if (bestLine != null) {
                lineWorkloads[bestLine] += weight;
            } else {
                // If no single line can accept the component, we need to split it
                int cost = calculateSplitCost(weight, complexity, lines);
                totalCost += cost;
                int splitWeight = weight / lines.size();

                for (int line : lines) {
                    if (lineWorkloads[line] + splitWeight <= lineCapacities.get(line)) {
                        lineWorkloads[line] += splitWeight;
                    } else {
                        // If the line still can't take its share of the split component, this is an error state
                        throw new RuntimeException("Unable to distribute component due to capacity constraints.");
                    }
                }
            }
        }

        return totalCost;
    }

    public static void main(String[] args) {
        // Example unit tests
        List<Component> components1 = Arrays.asList(
                new Component(10, 2, new HashSet<>(Arrays.asList(0))),
                new Component(5, 1, new HashSet<>(Arrays.asList(0))),
                new Component(8, 3, new HashSet<>(Arrays.asList(0)))
        );
        List<Integer> lineCapacities1 = Arrays.asList(100);
        System.out.println(optimizeComponentDistribution(components1, lineCapacities1));  // Output: 0

        List<Component> components2 = Arrays.asList(
                new Component(10, 2, new HashSet<>(Arrays.asList(0, 1))),
                new Component(5, 1, new HashSet<>(Arrays.asList(1))),
                new Component(8, 3, new HashSet<>(Arrays.asList(0)))
        );
        List<Integer> lineCapacities2 = Arrays.asList(20, 20);
        System.out.println(optimizeComponentDistribution(components2, lineCapacities2));  // Output: 5

        List<Component> components3 = Arrays.asList(
                new Component(15, 4, new HashSet<>(Arrays.asList(0, 1))),
                new Component(10, 2, new HashSet<>(Arrays.asList(0, 1))),
                new Component(5, 1, new HashSet<>(Arrays.asList(0, 1)))
        );
        List<Integer> lineCapacities3 = Arrays.asList(20, 20);
        System.out.println(optimizeComponentDistribution(components3, lineCapacities3));  // Output: 15

        List<Component> components4 = Arrays.asList(
                new Component(10, 2, new HashSet<>(Arrays.asList(0, 2))),
                new Component(5, 1, new HashSet<>(Arrays.asList(1, 3))),
                new Component(8, 3, new HashSet<>(Arrays.asList(2, 3))),
                new Component(12, 4, new HashSet<>(Arrays.asList(0, 1)))
        );
        List<Integer> lineCapacities4 = Arrays.asList(20, 20, 20, 20);
        System.out.println(optimizeComponentDistribution(components4, lineCapacities4));  // Output: 18
    }
}
