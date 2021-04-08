package example03;

public class BlockEx {
	
	//インスタンス初期化ブロック：インスタンスが生成するたびに呼び出す（heapへ生成）
	{
		System.out.println("インスタンス初期化ブロック実行");
	}
	
	//Static初期化ブロック：一回のみ実行（クラス領域へ）
	static {
		System.out.println("Static初期化ブロック実行");
	}

	public BlockEx() {
		System.out.println("インストラクター呼び出し");
	}
	
	public static void main(String[] args) {
		
		BlockEx b = new BlockEx();

	}

}
