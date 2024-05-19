package ProgramacionDinamica;

public class Punto9 {

    public int[][] misterio (int n, int k)
	{
		int resultado [][] = new int[n+1][k+1];
		
		for (int i = 0; i <= n; i++)
		{
			for (int j = 0; j <= menor(i, k); j++)
			{
				if (j == 0)
				{
					resultado[i][j] = 3 * i ;
				}
				if (j == i)
				{
					resultado[i][j] = (int) Math.pow(i, j);
				}
				else
				{
					resultado[i][j] = (resultado[i-1][j-1]) + 
      (4 * resultado[i][j-1]);
				}
			}
		}
		return resultado;
	}

	
int menor (int a, int b)
	{
		if (a<b)
		{
			return a;
		}
		else 
		{
			return b;
		}
	}

    
}
