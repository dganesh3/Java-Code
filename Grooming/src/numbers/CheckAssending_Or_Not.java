package numbers;

public class CheckAssending_Or_Not 
{
	public static boolean check(int[] num)
	{
		for(int i=0;i<=num.length-2;i++)
		{
			if(num[i]>num[i+1])
			{

				return false;
			}


		}
		return true;
	}
	public static boolean isMonotonic(int[] array)
	{
		boolean isIncreasing = true;
		boolean isDecreasing = true;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				isIncreasing = false;
			}
			if (array[i] < array[i + 1]) {
				isDecreasing = false;
			}
		}

		return isIncreasing || isDecreasing;
	}
public	static void designSwastika(int rows, int cols)  
	{  
		for (int u = 0; u < rows; u++) {  
			for (int v = 0; v < cols; v++)  
			{  
				// check whether u is less than from half of rows or not  
				if (u < rows / 2)  
				{  
					// check whether v is less than from half of cols or not  
					if (v < cols / 2)  
					{  
						// print '*' if v == 0  
						if (v == 0)   
						{  
							System.out.print("*");  
						}  
						// else we print space  
						else   
						{  
							System.out.print(" "+ " ");  
						}  
					}  
					// check whether v is equal to half of cols or not  
					else if (v == cols / 2)   
					{  
						System.out.print(" *");  
					}  
					else  
					{  
						// u = 0 denotes 1st row that will have '*'  
						if (u == 0)  
							System.out.print(" *");  
					}  
				}  
				// check whether u is equal to half of rows or not  
				else if (u == rows / 2) {  
					System.out.print("* ");  
				}  
				else  
				{  
					// When u > rows/2, the middle and last column will have '*'  
					if (v == cols / 2 || v == cols - 1)  
					{  
						System.out.print("* ");  
					}  
					else if (u == rows - 1)  
					{  
						// if v <= cols/2 OR if it is last column, the last row will be have '*'  
						if (v <= cols / 2 || v == cols - 1)   
						{  
							System.out.print("* ");  
						}  
						else {  
							System.out.print(" "+ " ");  
						}  
					}  
					else  
						System.out.print(" "+" ");  
				}  
			}  
			System.out.print("\n");  
		}  


	}
		public static void main(String[] args) 
		{
			//		int arr[]= {1,2,3,4};
			//	//	System.out.println(check(arr));
			//		System.out.println(isMonotonic(arr));
			designSwastika(5, 5);

		}

	}
