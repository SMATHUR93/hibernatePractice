package com.shrek.hibernate.app2.entity;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inp={1,1,3,4,2,5,6,6,7,2,1,3,5};			
		int inputlength=inp.length;
		//int[] out=new int[inputlength];
		int[][] matrix=new int[inputlength][3];
		int[][] tempmatrix=new int[inputlength][3];
		int i,j;
		for(i=0;i<inputlength;i++){
			matrix[i][1]=0;
			matrix[i][2]=-1;
		}
		int matlen=1;
		matrix[0][0]=inp[0];
		matrix[0][1]=1;
		matrix[0][2]=0;
		for(i=1;i<inputlength;i++){
			//System.out.println("OUT LOOP "+(i));
			for(j=0;j<matlen;j++){
				//System.out.println("IN LOOP COMPARING  matlen= "+matlen+" i= "+i+" j= "+j+" inp[i]= "+inp[i]+" matrix[j][0]= "+matrix[j][0]+" matrix[j][1]= "+matrix[j][1]);
				if(inp[i]==matrix[j][0]){
					matrix[j][1]++;
					//System.out.println("prexist condition matlen= "+matlen+" i= "+i+" j= "+j+" inp[i]= "+inp[i]+" matrix[j][0]= "+matrix[j][0]+" matrix[j][1]= "+matrix[j][1]);
					break;
				}
			}
			if(j==matlen){				
				matrix[j][0]=inp[i];
				matrix[j][1]++;
				matrix[j][2]=i;
				matlen++;
				//System.out.println("unique condition  matlen= "+matlen+" i= "+i+" j= "+j+" inp[i]= "+inp[i]+" matrix[j][0]= "+matrix[j][0]+" matrix[j][1]= "+matrix[j][1]);
			}
		}
		System.out.println("MY MATRIX x        and       y           and          z");
		for(i=0;i<matlen;i++){
			tempmatrix[i][0]=matrix[i][0];
			tempmatrix[i][1]=matrix[i][1];
			tempmatrix[i][2]=matrix[i][2];
			System.out.println("Number is "+matrix[i][0]+" and frequency is "+matrix[i][1]+" and first occurence is "+matrix[i][2]);
		}
		// SORTING TEMP MATRIX
		int tempnumber,tempfreq,tempfirstoccur;
		for(i=0;i<matlen;i++){
			for(j=i+1;j<matlen;j++){
				if(tempmatrix[i][1]<tempmatrix[j][1]){
					tempnumber=tempmatrix[j][0];
					tempmatrix[j][0]=tempmatrix[i][0];
					tempmatrix[i][0]=tempnumber;

					tempfreq=tempmatrix[j][1];
					tempmatrix[j][1]=tempmatrix[i][1];
					tempmatrix[i][1]=tempfreq;

					tempfirstoccur=tempmatrix[j][2];
					tempmatrix[j][2]=tempmatrix[i][2];
					tempmatrix[i][2]=tempfirstoccur;
				}
			}
		}
		System.out.println("MY MATRIX FREQ SORT x and       y           and          z");
		for(i=0;i<matlen;i++){
			System.out.println("Number is "+tempmatrix[i][0]+" and frequency is "+tempmatrix[i][1]+" and first occurence is "+tempmatrix[i][2]);
		}
		for(i=0;i<matlen;i++){
			for(j=0;j<tempmatrix[i][1];j++){
				System.out.print(tempmatrix[i][0]+" , ");
			}
		}

	}

}