package forwardoffer;

public class FrogJump {

	/*
	 * ������̨������:
	 * ���ܿ���������ߵ�̨�ף�����������һ��n����̨���ܹ��ж���������
	 * ÿ��̨�����ܿ���ѡ�������������һ��̨�ױ�������
	 * ����2^(n-1)������
	 * 
	 */
	public int  JumpFloorInRecursion(int target){
		if(target <= 0){
			return -1;
		}else if(target == 1){
			return 1;
		}else{
			return 2*JumpFloorInRecursion(target-1); 
		}
	}
	
	public int JumpFloorInMath(int target){
		return (int)Math.pow(2,target-1);
	}
	
}
