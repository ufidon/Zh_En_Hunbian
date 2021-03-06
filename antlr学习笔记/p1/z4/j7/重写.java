/**
 * 应用ANTLR4生成的取词器与树句器
*/

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class 重写 {
    public static void main(String[] 行参集) throws Exception {
        String 程档名 = "./类.java";
        if (行参集.length > 0) {
            程档名 = 行参集[0];
        }

        /** 新版antlr4 */
        CharStream 码流 = CharStreams.fromFileName(程档名);
        JavaLexer 取词器 = new JavaLexer(码流);
        CommonTokenStream 词流 = new CommonTokenStream(取词器);
        JavaParser 树句器 = new JavaParser(词流);        
        ParseTree 树 = 树句器.compilationUnit(); // 语法分析

        ParseTreeWalker 行者 = new ParseTreeWalker();
        插序号 插 = new 插序号(词流);
        行者.walk(插, 树);

        System.out.println(插.重写器.getText());
        
    }
}