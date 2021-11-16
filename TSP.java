import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class TSP {

    private final Map<String, Map<String, Integer>> distances;


    public TSP(Map<String, Map<String, Integer>> distances) {
        this.distances = distances;
    }

    public static <T> void swap(T[] array, int first, int second) {
        
        T temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static <T> void allPermutationsHelper(T[] permutation, List<T[]> permutations, int n) {
        
        // Base case - we found a new permutation, add it and return
        if (n <= 0) {
            permutations.add(permutation);
            return;
        }

        // Recursive case - find more permutations by doing swaps
        T[] tempPermutation = Arrays.copyOf(permutation, permutation.length);
        for (int i = 0; i < n; i++) {
              swap(tempPermutation, i, n - 1); // move element at i to end
              // move everything else around, holding the end constant
              allPermutationsHelper(tempPermutation, permutations, n - 1);
              swap(tempPermutation, i, n - 1); // backtrack
        }
    }


    private static <T> List<T[]> permutations(T[] original) {

        List<T[]> permutations = new ArrayList<>();
        allPermutationsHelper(original, permutations, original.length);
        return permutations;
    }


    public int pathDistance(String [] path) {

        String last = path[0];
        int distance = 0;

        for (String next: Arrays.copyOfRange(path, 1, path.length)) {
            distance += distances.get(last).get(next);
            // distance to get back from last city to first city
            last = next;
        }

        return distance;
    }

    public String[] findShortestPath() {

        String[] cities = distances.keySet().toArray(String[]::new);
        List<String []> paths = permutations(cities);
        String [] shortestPath = null;
        int minDistance = Integer.MAX_VALUE; // arbitrarily high

        for (String [] path: paths) {
            
            int distance = pathDistance(path);
            // distance from last to first must be added
            distance += distances.get(path[path.length - 1]).get(path[0]);

            if (distance < minDistance) {
                minDistance = distance;
                shortestPath = path;
            }
        }

        // add first city on to end and return
        shortestPath = Arrays.copyOf(shortestPath, shortestPath.length + 1);
        shortestPath[shortestPath.length - 1 ] = shortestPath[0];
        return shortestPath;
    }

}