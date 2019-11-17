package hashtable.problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/subdomain-visit-count/
 */
public class SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> resultsMap = new HashMap<>();

        for (String entry : cpdomains) {
            String[] arr = entry.split(" ");
            Integer numOfVisitis = Integer.valueOf(arr[0]);
            String domains = arr[1];

            addToMap(resultsMap, domains, numOfVisitis);

            boolean hasMoreDomains = true;

            while (hasMoreDomains) {
                domains = domains.substring(domains.indexOf(".") + 1);
                addToMap(resultsMap, domains, numOfVisitis);
                if (!domains.contains(".")) {
                    hasMoreDomains = false;
                }
            }
        }

        List<String> resultsList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : resultsMap.entrySet()) {
            resultsList.add(entry.getValue() + " " + entry.getKey());
        }

        return resultsList;
    }

    private void addToMap(Map<String, Integer> map, String key, Integer value) {
        if (map.get(key) != null) {
            map.put(key, map.get(key) + value);
        } else {
            map.put(key, value);
        }
    }

    public static void main(String[] args) {
        SubdomainVisitCount test = new SubdomainVisitCount();
        test.subdomainVisits(new String[]{"9001 discuss.leetcode.com"});
    }
}
