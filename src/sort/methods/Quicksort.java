/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

/**
 *
 * @author LeopardProMK
 */
public class Quicksort {
    /* http://www.algorytm.org/algorytmy-sortowania/sortowanie-szybkie-quicksort/quick-j.html */
    private static void quicksort(double tablica[], int x, int y) {
 
    int i,j;
    double v,temp;
    
    i=x;
    j=y;
    v=tablica[(x+y) / 2];
    do {
    while (tablica[i]<v)
    i++;
    while (v<tablica[j])
    j--;
    if (i<=j) {
    temp=tablica[i];
    tablica[i]=tablica[j];
    tablica[j]=temp;
    i++;
    j--;
    }
}   
while (i<=j);
    
if (x<j)
    quicksort(tablica,x,j);
if (i<y)
    quicksort(tablica,i,y);
}
}
