package offer12;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		/*
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCED";
		*/
		/*
		char[][] board = {{'a','b'},{'c','d'}};
		String word = "abcd";
		*/
		
		char[][] board = {{'a','a'}};
		String word = "aaa";
		
		Solution2 solution = new Solution2();
		System.out.println(solution.exist(board, word));
		

		/*
		Set<Integer> road = new HashSet<Integer>();
		int x=0;
		System.out.println(road.add(x));
		x++;
		System.out.println(road.add(x));
		*/
	}
}
