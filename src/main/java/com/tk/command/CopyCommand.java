package com.tk.command;

public class CopyCommand extends Command {

    private Content content = null;

    public CopyCommand(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        content.msg = content.msg + content.msg;
    }

    @Override
    public void undo() {
        content.msg = content.msg.substring(0, content.msg.length() / 2);
    }
}
