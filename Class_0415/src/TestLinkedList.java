
import java.util.*;
import java.awt.Point;

public class TestLinkedList {

	public static void main(String[] args) {
		List<Point> myList;
		EList testList;
		testList = new EList();
		System.out.println("Length of linked list = " + testList.length()); //expect 0
		myList = new LinkedList<Point>();
		Point p;
		p = new Point(0,-1);
		myList.add(p);
		myList.add(new Point(3,4));
		myList.add(new Point(5,6));
		testList.addToEnd(p);
		testList.add(new Point(3,4));
		testList.addToEnd(new Point(5,6));
		testList.addToEnd(new Point(7,8));
		Point p2 = new Point (3,4);
		
		System.out.println(myList);
		System.out.println(myList.contains(p2));
		System.out.println(testList);
		System.out.println("Length of linked list = " + testList.length()); //expect 3		
		
		System.out.println("6! = " + testList.factorial(6));
		System.out.println("10! = " + testList.factorial(10));
		
		for (int i =0; i < 15; i++) {
			System.out.println(i + "! =" + testList.factorial(i));
		}
		testList.countDown(10);
		System.out.println();
		testList.countDown(1);
		System.out.println();
		testList.countDown(200);
		System.out.println();	
		
	}

}

/*
Length of linked list = 0
[java.awt.Point[x=0,y=-1], java.awt.Point[x=3,y=4], java.awt.Point[x=5,y=6]]
true
 java.awt.Point[x=3,y=4] java.awt.Point[x=0,y=-1] java.awt.Point[x=5,y=6] java.awt.Point[x=7,y=8]
Length of linked list = 4
6! = 720
10! = 3628800
0! =1
1! =1
2! =2
3! =6
4! =24
5! =120
6! =720
7! =5040
8! =40320
9! =362880
10! =3628800
11! =39916800
12! =479001600
13! =1932053504
14! =1278945280
10 9 8 7 6 5 4 3 2 1 
1 
200 199 198 197 196 195 194 193 192 191 190 189 188 187 186 185 184 183 182 181 180 179 178 177 176 175 174 173 172 171 170 169 168 167 166 165 164 163 162 161 160 159 158 157 156 155 154 153 152 151 150 149 148 147 146 145 144 143 142 141 140 139 138 137 136 135 134 133 132 131 130 129 128 127 126 125 124 123 122 121 120 119 118 117 116 115 114 113 112 111 110 109 108 107 106 105 104 103 102 101 100 99 98 97 96 95 94 93 92 91 90 89 88 87 86 85 84 83 82 81 80 79 78 77 76 75 74 73 72 71 70 69 68 67 66 65 64 63 62 61 60 59 58 57 56 55 54 53 52 51 50 49 48 47 46 45 44 43 42 41 40 39 38 37 36 35 34 33 32 31 30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 
*/