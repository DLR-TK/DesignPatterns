package com.tk.command;

public class DeleteCommand extends Command{

    private Content content = null;
    private String deleted = "";

    public DeleteCommand(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        deleted = content.msg.substring(0 , 5);
        content.msg = content.msg.substring(5 , content.msg.length());
    }

    @Override
    public void undo() {
        content.msg = deleted + content.msg;
    }
}
