/*
오늘도 서준이는 병합 정렬 수업 조교를 하고 있다.
아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.

N개의 서로 다른 양의 정수가 저장된 배열 A가 있다. 
병합 정렬로 배열 A를 오름차순 정렬할 경우 배열 A에 K 번째 저장되는 수를 구해서 우리 서준이를 도와주자.

크기가 N인 배열에 대한 병합 정렬 의사 코드는 다음과 같다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Boj24060
{
	
	static int[] A, tmp;
	static int count = 0;
	static int result = -1;
	static int K;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		tmp = new int[N];
		mergeSort(A, 0, N - 1);
		System.out.println(result);
		
	}
	
	public static void mergeSort(int[] A, int p, int r) {
		if (count > K)
		{	
			return;
		}
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(A, p, q);
			mergeSort(A, q + 1, r);
			merge(A, p, q, r);
		}
	}
	
	public static void merge(int[] A, int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int t = 0;
		
		while (i <= q && j <= r) {
			if(A[i] <= A[j]) {
				tmp[t] = A[i];
				i++;
			}else {
				tmp[t] = A[j];
				j++;
			}
			t++;
		}
		
		while (i <= q) 
			tmp[t++] = A[i++];

		while (j <= r) 
			tmp[t++] = A[j++];

		i = p;
		t = 0;
		while (i <= r) {
			count++;
			if (count == K) {
				result = tmp[t];
				break;
			} 
			A[i++] = tmp[t++];
		}
	}
	
}
