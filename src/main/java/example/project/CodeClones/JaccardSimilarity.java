package example.project.CodeClones;

import java.util.HashSet;
import java.util.Set;

public class JaccardSimilarity {

    public static double computeJaccardSimilarity(Set<String> set1, Set<String> set2) {
        // TODO: implement this function to compute the Jaccard similarity between two string arrays
        Set<String> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        float numerator = intersect.size();
        float denominator = set1.size()+set2.size()-numerator;
        return (numerator/denominator);
    }

}
