/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Gunjan
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int [] item = {1,7,12,44,56,76,83,92,100};
        int key = 44;
        System.out.println(search(item, key));
    }
    
    public static int search(int[]item, int key) {
        int min = 0;
        int max = item.length - 1;
        int mid = min + ((min+max)/2);
        
        if (item[mid] == key){
            return mid;
        }
        else if (item[mid] > key) {
            max = mid - 1;
        }
        else {
            min = mid + 1;
        }
        return -1;
    }
}
