package Com.wangyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



/*
 * С��������һ��ʯ��·ǰ��ÿ��ʯ���ϴ�1���ű��Ϊ��1��2��3.......
 * ����ʯ��·Ҫ��������Ĺ������ǰ��������С�׵�ǰ���ڵı��ΪK�� ʯ�壬С�׵���ֻ����ǰ��K��һ��Լ��(����1��K)����
 * ������K+X(XΪK��һ����1�ͱ����Լ��)��λ�á� С�׵�ǰ���ڱ��ΪN��ʯ�壬�����������ǡ��ΪM��ʯ��ȥ��С����֪��
 * ������Ҫ��Ծ���ο��Ե��
 * ���磺
 * N =4��M = 24��
 * 4->6->8->12->18->24
 * ����С��������Ҫ��Ծ5�Σ��Ϳ��Դ�4��ʯ������24��ʯ�� 
 * 
 * 
 * ����Ϊһ�У�����������N��M���Կո������
 * (4 �� N �� 100000)
 * (N �� M �� 100000)
 * 
 * ���С��������Ҫ��Ծ�Ĳ���,������ܵ������-1
 * 
 * ˼·����1-M��ʯ�忴��һ���������res��
 * ÿ��res[i]�����Ŵ���㵽��һ����С�Ĳ�����
 * ����0Ϊ���ܵ������㿪ʼ��res���б�����
 * ����i������Լ��������res[i]���ߵĲ�������
 * Ȼ������Ǽ����ܵ����λ�õ���С����
 * ��������ܵ��������Ϊ��ʱλ�õ���С����+1��
 * ������ܵ���ľ͸���Ϊmin���Ѽ�¼����С�������˴�����С����+1������
 * ����һ���õ������
 * 
 */
public class JumpStone {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int m;
        while(in.hasNext()){
            n = in.nextInt();
            m = in.nextInt();
            System.out.println(solveDP(n,m));
        }

    }
    private static int solveDP(int n,int m){
        int[] dp = new int[m+1]; // ���� iλ����Ҫ����С����
        if(m==n)
            return 0;
        Arrays.fill(dp, Integer.MAX_VALUE);
//        System.out.println(Arrays.toString(dp));
        dp[n] = 0;//ʹnλ��Ϊ0
        for(int i=n;i<=m;i++){
            if(dp[i] == Integer.MAX_VALUE){ // ��λ�ò�����ǰ��
                dp[i] = 0;
                continue;
            }
            ArrayList<Integer> gcd = getList(i);
            for(int j=0;j<gcd.size();j++){
                int x = gcd.get(j);
                if(i+x<=m) // ��¼��ǰ�ߵĳ��ȣ�������С�Ĳ���
                    dp[i+x] = Math.min(dp[i+x], dp[i] + 1);
            }
        }
        if(dp[m]==0)
            return -1;
        else
            return dp[m];
        
    }
    // ������ ʱ�临�Ӷ� sqrt��n�� ��ǿ��
    public static ArrayList<Integer> getList(int k){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=2;i*i<=k;i++){
            if(k%i ==0){
                if(i!=1&&i!=k)
                    list.add(i);
                if((i*i)!=k&&(k/i)!=1&&(k/i)!=k)
                    list.add(k/i);
            }
        }
        return list;
    }
}
