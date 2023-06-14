import java.util.*;
public class DuplicateElement
{

  static int[] findDuplicates (int[]nums)
  {
    List < Integer > list = new ArrayList <> ();
    for (int i = 0; i < nums.length; i++)
      {
	for (int j = i + 1; j < nums.length; j++)
	  {
	    if (nums[i] == nums[j])
	      {
		list.add (nums[j]);
	      }
	  }
      }
    int[] duplicates = new int[list.size ()];
    for (int i = 0; i < list.size (); i++)
      {
	duplicates[i] = list.get (i);
      }
    return duplicates;
  }

  public static void main (String[]args)
  {
    int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
    int[] duplicate = findDuplicates (nums);
    System.out.print (Arrays.toString (duplicate));
  }
}
