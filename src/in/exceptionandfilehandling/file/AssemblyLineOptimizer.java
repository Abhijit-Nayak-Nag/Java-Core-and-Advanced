package in.exceptionandfilehandling.file;

import java.util.*;

class Component {
    int weight;
    int complexity;
    Set<Integer> compatibleLines;

    public Component(int weight, int complexity, Set<Integer> compatibleLines) {
        this.weight = weight;
        this.complexity = complexity;
        this.compatibleLines = compatibleLines;
    }
}

class Line {
    int capacity;
    int currentWorkload;

    public Line(int capacity) {
        this.capacity = capacity;
        this.currentWorkload = 0;
    }
}

public class AssemblyLineOptimizer {

    public static int optimizeComponentDistribution(List<Component> components, List<Line> lines) {
        int totalCost = 0;

        for (Component component : components) {
            int weight = component.weight;
            int complexity = component.complexity;
            List<Integer> compatibleLines = new ArrayList<>(component.compatibleLines);

            // Try to assign the whole component to a single compatible line
            boolean assigned = false;
            for (int line : compatibleLines) {
                if (lines.get(line).currentWorkload + weight <= lines.get(line).capacity) {
                    lines.get(line).currentWorkload += weight;
                    assigned = true;
                    break;
                }
            }

            // If not possible, split the component across multiple lines
            if (!assigned) {
                int remainingWeight = weight;
                int splits = 0;
                for (int line : compatibleLines) {
                    if (remainingWeight == 0) break;
                    if (lines.get(line).currentWorkload < lines.get(line).capacity) {
                        int availableCapacity = lines.get(line).capacity - lines.get(line).currentWorkload;
                        int assignWeight = Math.min(remainingWeight, availableCapacity);
                        lines.get(line).currentWorkload += assignWeight;
                        remainingWeight -= assignWeight;
                        splits++;
                    }
                }
                totalCost += (splits - 1) * (weight + complexity);
            }
        }

        return totalCost;
    }

    public static void main(String[] args) {
        List<Component> components1 = Arrays.asList(
                new Component(10, 2, new HashSet<>(Arrays.asList(0))),
                new Component(5, 1, new HashSet<>(Arrays.asList(0))),
                new Component(8, 3, new HashSet<>(Arrays.asList(0)))
        );
        List<Line> lines1 = Arrays.asList(new Line(100));
        System.out.println(optimizeComponentDistribution(components1, lines1));  // Expected Output: 0

        List<Component> components2 = Arrays.asList(
                new Component(10, 2, new HashSet<>(Arrays.asList(0, 1))),
                new Component(5, 1, new HashSet<>(Arrays.asList(1))),
                new Component(8, 3, new HashSet<>(Arrays.asList(0)))
        );
        List<Line> lines2 = Arrays.asList(new Line(20), new Line(20));
        System.out.println(optimizeComponentDistribution(components2, lines2));  // Expected Output: 5

        List<Component> components3 = Arrays.asList(
                new Component(15, 4, new HashSet<>(Arrays.asList(0, 1))),
                new Component(10, 2, new HashSet<>(Arrays.asList(0, 1))),
                new Component(5, 1, new HashSet<>(Arrays.asList(0, 1)))
        );
        List<Line> lines3 = Arrays.asList(new Line(20), new Line(20));
        System.out.println(optimizeComponentDistribution(components3, lines3));  // Expected Output: 10

        List<Component> components4 = Arrays.asList(
                new Component(10, 2, new HashSet<>(Arrays.asList(0, 2))),
                new Component(5, 1, new HashSet<>(Arrays.asList(1, 3))),
                new Component(8, 3, new HashSet<>(Arrays.asList(2, 3))),
                new Component(12, 4, new HashSet<>(Arrays.asList(0, 1)))
        );
        List<Line> lines4 = Arrays.asList(new Line(20), new Line(20), new Line(20), new Line(20));
        System.out.println(optimizeComponentDistribution(components4, lines4));  // Expected Output: 18
    }
}
