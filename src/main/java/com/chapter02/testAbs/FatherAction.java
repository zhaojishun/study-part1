package com.chapter02.testAbs;

/**
 * 爸爸，老爸比较悲催，没有继承爷爷的强大基因，只继承了普通屌丝人类行为
 */
public class FatherAction extends AbstractPersonAction {
    @Override
    public void run() {
        super.p ("我压根就不会跑步，也没有继承老爸的强大基因！");
    }

    @Override
    public void batTamper() {
        super.p ("我的脾气不太好，暴躁 ！");
    }
}
