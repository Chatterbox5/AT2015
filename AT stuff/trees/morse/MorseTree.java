package morse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import binTree.TreeNode;


public class MorseTree extends BalancedTree
{
	public MorseTree()
	{
		this("0_9O .8M Q G Z7T Y K C N X D B6/1J W P A   R L E2- U F I3V S4H5");
	}
	
	public MorseTree(String letters)
	{
		super(letters.split(""));
	}

	public String toEnglish(String m)
	{
		String translated = "";
		
		for (String s : m.replaceAll("/", " --.-- ").split(" "))
			translated += getLetter(s);
		
		return translated;
	}
	
	public String toMorse(String e)
	{
		String[] letters = e.split("");
		String morse = "";
		
		for (String s : letters)
		{
			if (s.equals(" "))
				System.out.print("/ ");
			else
			{
				getMorse(s);
				System.out.print(" ");
			}

		}
		
		System.out.println("/");
		
		return morse;
	}
	
	public String getLetter(String m)
	{
		TreeNode node = root();

		while (m.length() != 0)
		{
			if (m.charAt(0) == '-')
				node = node.getLeft();
			else
				node = node.getRight();

			m = m.substring(1);
		}

		return ((String) node.getValue()).substring(0, 1);
	}

	public String getMorse(String letter)
	{
		return getMorse(letter, "", root());
	}
	
	public String getMorse(String letter, String morse, TreeNode tree)
	{
		if (tree == null)
			return "";
		
		if(tree.getValue().equals(letter))
		{
			System.out.print(morse);
		
			return morse;
		}
		
		if (search(getMorse(letter, morse + "-", tree.getLeft()).equals(letter)))
				return getMorse(letter, morse + "-", tree.getLeft());
		else if (search(getMorse(letter, morse + ".", tree.getRight()).equals(letter)))
				return getMorse(letter, morse + ".", tree.getRight());
		
		return "";
	}
	
}