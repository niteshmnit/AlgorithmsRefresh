package com.algo.sorting;

public class MergeSort {


    public int[] sort(int[] input,int first,int last) {
        int mid= (first+last)/2;

        System.out.println("first:"+first+ ", Last:"+last);

        if(first<last) {
            int[] firstSplit = sort(input, first, mid);
            int[] secondSplit= sort(input, mid + 1, last);
            return merge(firstSplit,secondSplit);
        }
        else {
            int[] result= new int[1];
            result[0] = input[first];
            return result;
        }

    }

    private int[] merge(int[] first,int[] second) {
    int[] sorted = new int[first.length+second.length];

    int i=0 ;
    int j=0 ;
    int k=0 ;

    while (i<first.length&& j<second.length){
        if(first[i]<second[j]){
            sorted[k++]=first[i++];
        }
        else{
            sorted[k++]=second[j++];
        }
    }
    while (i<first.length){
        sorted[k++]=first[i++];
    }
    while (j<second.length){
        sorted[k++]=second[j++];
    }

    return sorted;
    }

}
