
### 共有用の Scanner を Main で1回だけ作り、Menu -> BookService -> BookRegist に注入する形

1つの Scanner を `Main.java` で生成し、
- Menu.java
- BookService.java
- BookRegist.java
へコンストラクタ経由で共有する形にリファクタ

### scanner 依存を整理
InputHandler に入力処理を集約し、scanner を直接持つのは Main.java だけに修正
