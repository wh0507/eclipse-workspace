package example01;

// 設計図
public class Fieldinit {
	// 基本型 変数
	byte byteField;			// 1byte
	short shortField;          // 2btye
	int intField;                  // 4btye(デフォルトタイプ)          
	long longField;            // 8btye
	
	boolean boolField;          // 1btye
	char charField;                // 2btye
	
	float floatField;                // 4btye
	double doubleField;        // 8btye(デフォルトタイプ)
	
	//参照 変数
	int[] arrField;                  // 4btye
	String strField;               // 4btye
	
	// toString() : 클래스의 멤버변수(필드)의 들을 수시로 확인 할때 사용
	// 원하는 포맷으로 멤버변수들을 출력하고자 할때 사
	@Override      //→ annotationと呼ぶ
	public String toString() {
		String str = "byteField：" + byteField + ", shortField：" + shortField + 
							", intField：" + intField + ", boolField：" + boolField +
							", strField：" + strField;
		return str;
		
	}
}
