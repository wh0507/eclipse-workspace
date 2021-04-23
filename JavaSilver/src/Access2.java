
import static pac1.pac2.Access1.*; 	//静的インポートを行い、static変数numをインポートしている
import pac1.pac2.Access1;

public class Access2 {
	int num1 = Access1.num;	//Access1クラス自体のインポートは行っていない。（３行目のインポートが内場合）
	int num2 = num;
	int num3 = pac1.pac2.Access1.num;
	
}
