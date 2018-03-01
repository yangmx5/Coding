package base;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 1, 4, 6, 8, 1, 2 };
		
		System.out.println(Arrays.toString(sort(arr , 0 , arr.length -1)));

	}

	private static int[] sort(int[] arr, int start, int end) {
		int mid = (end + start) / 2;
		if (start < end) {
			sort(arr, start, mid);
			sort(arr, mid+1, end);
			MergeSort(arr, start, mid, end);
		}
		return arr;

	}

	private static void MergeSort(int[] arr, int start, int mid, int end) {
		int[] temp = new int[end - start + 1];
		int i = start;
		int j = mid + 1;
		int k = 0;

		//��������Ԫ�ؽ�������
		while (i <= mid && j <= end) {
			if (arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}
		
		//�����ʣ��Ԫ�ط��뻺��������
		while(i <= mid){
			temp[k++] = arr[i++];
		}
		
		//���ұ�ʣ��Ԫ�ط��뻺��������
		while(j <= end){
			temp[k++] = arr[j++];
		}

		//�����������е�Ԫ�ط���ԭ������
		for(int  i1 =0 ; i1< temp.length; i1++){
			arr[start+i1] = temp[i1];
		}
		
	}

}
