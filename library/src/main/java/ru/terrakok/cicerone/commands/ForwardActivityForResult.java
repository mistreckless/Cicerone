package ru.terrakok.cicerone.commands;

/**
 * Created by @mistreckless on 22.11.2017. !
 */

public class ForwardActivityForResult implements Command {
    private final String screenKey;
    private final int requestCode;
    private final Object transitionData;

    public ForwardActivityForResult(String screenKey, int requestCode, Object transitionData) {
        this.screenKey = screenKey;
        this.requestCode = requestCode;
        this.transitionData = transitionData;
    }

    public String getScreenKey() {
        return screenKey;
    }

    public int getRequestCode() {
        return requestCode;
    }

    public Object getTransitionData() {
        return transitionData;
    }


}
