package com.sg.tennis;

public enum Score {
    ZERO,
    FIFTEEN,
    THIRTY,
    FORTY,
    WIN;

    public Score getNext() {
        return this.ordinal() < Score.values().length - 1
                ? Score.values()[this.ordinal() + 1]
                : null;
    }
}
