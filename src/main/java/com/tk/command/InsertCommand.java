package com.tk.command;

public class InsertCommand extends Command {

    private Content content = null;
    private String strToInsert = " www.baidu.com ";

    public InsertCommand(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        content.msg = content.msg + strToInsert;
    }

    @Override
    public void undo() {
        content.msg = content.msg.substring(0, content.msg.length() - strToInsert.length());
    }
}
