// =============================================================================
// POSTING THIS FILE ONLINE OR DISTRIBUTING IT IN ANY WAY, IN PART OR IN WHOLE,
// IS AN ACT OF ACADEMIC MISCONDUCT AND ALSO CONSTITUTES COPYRIGHT INFRINGEMENT.
// =============================================================================

// Bryan Aneyro Hernandez
// br867228
// COP 3330, Spring 2023

// =============================================================================
//             PotionMaster ~ Sean Szumlanski ~ COP 3330 ~ Spring 2023
// =============================================================================
// Note: I've put this template together for you so you can see one safe way of
// breaking up the method signatures that are too long to put on one line
// without exceeding the limit of 100 characters per line. You can modify
// anything you want in this file, and you can remove this comment.
// =============================================================================


import java.util.*;

public class PotionMaster
{
	public static Map<String, Set<String>> potionToReagentsMap(List<PotionInfo> potionsManual)
	{
		Map<String, Set<String>> map = new HashMap<>();

		if (potionsManual.isEmpty())
			return map;

		// Iterate through potionsManual List to build the needed map.
		for (PotionInfo potion : potionsManual)
			map.put(potion.name, new HashSet<>(potion.reagents));

		return map;
	}

	public static Map<String, Set<String>> reagentToPotionsMap(List<PotionInfo> potionsManual)
	{
		Map<String, Set<String>> map = new HashMap<>();

		if (potionsManual.isEmpty())
			return map;

		// Iterate through each potion and each of its reagents to build the needed map.
		for (PotionInfo potion : potionsManual)
		{
			for (String reagent : potion.reagents)
			{
				// If the map doesn't already contain the reagent, add a new set for it.
				if (!map.containsKey(reagent))
				{
					map.put(reagent, new HashSet<>());
				}

				// Add the potion name to the set for the current reagent.
				map.get(reagent).add(potion.name);
			}
		}

		return map;
	}

	// Checks if the set of reagents can brew the given potion.
	// public static boolean canBrewPotion(PotionInfo potionInfo, Set<String> reagentsOnHand)
	// {
	// 	if (reagentsOnHand.isEmpty())
	// 		return false;

	// 	if (reagentsOnHand.containsAll(potionInfo.reagents))
	// 		return true;

	// 	return false;
	// }

	public static boolean canBrewPotion(PotionInfo potionInfo, Set<String> reagentsOnHand)
	{
	    for (String reagent : potionInfo.reagents)
	    {
	        if (!reagentsOnHand.contains(reagent))
	        {
	            return false;
	        }
	    }
	    return true;
	}

	// Checks if reagents can brew potion by looking up reqs. in map.
	// public static boolean canBrewPotion(String potionToBrew,
	//                                     Map<String, Set<String>> potionToReagentsMap,
	//                                     Set<String> reagentsOnHand)
	// {
	// 	if (reagentsOnHand.isEmpty())
	// 		return false;

	// 	Set<String> required = new HashSet<>(potionToReagentsMap.get(potionToBrew));

	// 	if (reagentsOnHand.containsAll(required))
	// 		return true;

	// 	return false;
	// }

	 
	public static boolean canBrewPotion(String potionToBrew, Map<String, Set<String>> potionToReagentsMap, Set<String> reagentsOnHand)
	{
	    if (reagentsOnHand.isEmpty())
	        return false;

	    Set<String> required = potionToReagentsMap.get(potionToBrew);

	    for (String reagent : required)
	    {
	        if (!reagentsOnHand.contains(reagent))
	            return false;
	    }

	    return true;
	}
	

	// public static Set<String> allPossiblePotions(Map<String, Set<String>> potionToReagentsMap,
	//                                              Map<String, Set<String>> reagentToPotionsMap,
	//                                              Set<String> reagentsOnHand)
	// {
	// 	Set<String> possiblePot = new HashSet<>();

	// 	if (reagentsOnHand.isEmpty())
	// 		return possiblePot;

	// 	// Loop through each key in the potionToReagentsMap.
	// 	for (String pot : potionToReagentsMap.keySet())
	// 	{	
	// 		// Creating a new HashSet of the required reagents for the current potion.
	// 		Set<String> regSet = new HashSet<>(potionToReagentsMap.get(pot));
			
	// 		if (reagentsOnHand.containsAll(regSet))
	// 		{
	// 			possiblePot.add(pot);
	// 		}
	// 	}		

	// 	return possiblePot;
	// }

	
	public static Set<String> allPossiblePotions(Map<String, Set<String>> potionToReagentsMap, Map<String, Set<String>> reagentToPotionsMap, Set<String> reagentsOnHand)
	{
	    Set<String> possiblePot = new HashSet<>();

	    if (reagentsOnHand.isEmpty())
	        return possiblePot;

	    // Loop through each key in the potionToReagentsMap.
	    for (String pot : potionToReagentsMap.keySet())
	    {   
	        // Creating a new HashSet of the required reagents for the current potion.
	        Set<String> regSet = potionToReagentsMap.get(pot);

	        boolean possible = true;

	        for (String reagent : regSet)
	        {
	            if (!reagentsOnHand.contains(reagent))
	            {
	                possible = false;
	                break;
	            }
	        }

	        if (possible)
	            possiblePot.add(pot);
	    }       

	    return possiblePot;
	}
	

	public static double difficultyRating()
	{
		return 3.0;
	}

	public static double hoursSpent()
	{
		return 10.0;
	}
}
