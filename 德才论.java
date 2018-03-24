package com.codeliu;
import java.util.*;
/**
 * @author liu
 * @version ����ʱ�䣺2018��3��9�� ����6:40:55
 * ��Ŀ����
 * �δ�ʷѧ��˾����ڡ�����ͨ��������һ�������ġ��²��ۡ������ǹʲŵ�ȫ��ν֮ʥ�ˣ�
 * �ŵ¼���ν֮���ˣ���ʤ��ν֮���ӣ���ʤ��ν֮С�ˡ�
 * ��ȡ��֮����������ʥ�ˣ����Ӷ���֮�������С�ˣ����������ˡ���
 * �ָ���һ�������ĵ²ŷ����������˾�������۸���¼ȡ������
 * 
 * ��������
 * �����1�и���3�����������ֱ�Ϊ��N��<=105����������������L��>=60����Ϊ¼ȡ��ͷ����ߣ�
 * ���·ֺͲŷ־�������L�Ŀ��������ʸ񱻿���¼ȡ��H��<100����
 * Ϊ����¼ȡ�ߡ����·ֺͲŷ־������ڴ��ߵı�����Ϊ���ŵ�ȫ���������࿼�����²��ִܷӸߵ�������
 * �ŷֲ������·ֵ��ߵ�һ�࿼�����ڡ���ʤ�š���Ҳ���ܷ����򣬵����ڵ�һ�࿼��֮��
 * �²ŷ־�����H�����ǵ·ֲ����ڲŷֵĿ������ڡ��ŵ¼����������С���ʤ�š��ߣ����ܷ�����
 * �����ڵڶ��࿼��֮�������ﵽ�����L�Ŀ���Ҳ���ܷ����򣬵����ڵ����࿼��֮��
 * ���N�У�ÿ�и���һλ��������Ϣ��������׼��֤�š��·֡��ŷ֣�����׼��֤��Ϊ8λ������
 * �²ŷ�Ϊ����[0, 100]�ڵ����������ּ��Կո�ָ���
 * 
 * �������
 * �����1�����ȸ����ﵽ��ͷ����ߵĿ�������M�����M�У�ÿ�а��������ʽ���һλ��������Ϣ��
 * ������������˵���Ĺ���Ӹߵ������򡣵�ĳ�࿼�����ж����ܷ���ͬʱ������·ֽ������У�
 * ���·�Ҳ���У���׼��֤�ŵ����������
 * 
 * ��������
 * 14 60 80
 * 10000001 64 90
 * 10000002 90 60
 * 10000011 85 80
 * 10000003 85 80
 * 10000004 80 85
 * 10000005 82 77
 * 10000006 83 76
 * 10000007 90 78
 * 10000008 75 79
 * 10000009 59 90
 * 10000010 88 45
 * 10000012 80 100
 * 10000013 90 99
 * 10000014 66 60
 * 
 * �������
 * 12
 * 10000013 90 99
 * 10000012 80 100
 * 10000003 85 80
 * 10000011 85 80
 * 10000004 80 85
 * 10000007 90 78
 * 10000006 83 76
 * 10000005 82 77
 * 10000002 90 60
 * 10000014 66 60
 * 10000008 75 79
 * 10000001 64 90
 */
public class �²��� {
	public static  void main(String[] args) {
        
        class Student{
           String ID ;
           int morals;
           int talents;
           Student(String ID,int morals,int talents){
               this.ID = ID;
               this.morals = morals;
               this.talents = talents;
           }
       }

       ArrayList<Student> firstClass = new ArrayList<Student>();
       ArrayList<Student> secondClass = new ArrayList<Student>();
       ArrayList<Student> thirdClass = new ArrayList<Student>();
       ArrayList<Student> fourthClass = new ArrayList<Student>();
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int L = sc.nextInt();
       int H = sc.nextInt();
       Student[] student = new Student[num];
       for (int i = 0; i < num; i++) {
           student[i] = new Student(sc.next(),sc.nextInt(),sc.nextInt());
           if (student[i].morals >= H && student[i].talents >= H)
               firstClass.add(student[i]);
           else if (student[i].morals >= H && student[i].talents >= L )
               secondClass.add(student[i]);
           else if (student[i].morals >= L && student[i].talents >= L&&student[i].morals>=student[i].talents)
               thirdClass.add(student[i]);
           else if (student[i].morals >= L && student[i].talents >= L)
               fourthClass.add(student[i]);
       }
       System.out.println(firstClass.size()+secondClass.size()+thirdClass.size()+fourthClass.size());
       Comparator<Student> com = new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               if (o1.morals + o1.talents > o2.morals + o2.talents)
                   return -1;
               else if (o1.morals + o1.talents < o2.morals + o2.talents)
                   return 1;
               else {
                   if (o1.morals > o2.morals)
                       return -1;
                   else if (o1.morals < o2.morals)
                       return  1;
                   else {
                       if (Integer.valueOf(o1.ID) < Integer.valueOf(o2.ID))
                           return -1;
                       else
                           return 1;
                   }
               }
           }
       };
       Collections.sort(firstClass, com );
       Collections.sort(secondClass,com);
       Collections.sort(thirdClass,com);
       Collections.sort(fourthClass,com);
       for (int i = 0; i < firstClass.size(); i++) {
           String id = firstClass.get(i).ID;
           int m = firstClass.get(i).morals;
           int t = firstClass.get(i).talents;
           System.out.println( id+" "+m+" "+t);
       }
       for (int i = 0; i < secondClass.size(); i++) {
           String id = secondClass.get(i).ID;
           int m = secondClass.get(i).morals;
           int t = secondClass.get(i).talents;
           System.out.println( id+" "+m+" "+t);
       }

       for (int i = 0; i < thirdClass.size(); i++) {
           String id = thirdClass.get(i).ID;
           int m = thirdClass.get(i).morals;
           int t = thirdClass.get(i).talents;
           System.out.println( id+" "+m+" "+t);
       }

       for (int i = 0; i < fourthClass.size(); i++) {
           String id = fourthClass.get(i).ID;
           int m = fourthClass.get(i).morals;
           int t = fourthClass.get(i).talents;
           System.out.println( id+" "+m+" "+t);
       }
   }
}
