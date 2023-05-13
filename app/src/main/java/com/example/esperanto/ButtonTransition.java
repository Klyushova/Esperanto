package com.example.esperanto;

import android.content.Context;
import android.content.Intent;

import java.io.Serializable;

public class ButtonTransition implements Serializable {
    private final String name;
    private final Transition nextTransition;

    public ButtonTransition(String name, Transition nextTransition) {
        this.name = name;
        this.nextTransition = nextTransition;
    }

    public String getName() {
        return name;
    }

    public Transition getNextTransition() {
        return nextTransition;
    }

    public enum Transition {
        MENU_GRAMMAR {
            @Override
            public Intent newIntent(Context context) {
                return MenuActivity.newIntent(context, new ButtonTransition[]{
                        new ButtonTransition("Word", Transition.MENU_GRAMMAR)
                });
            }
        },
        MENU_WORD {
            @Override
            public Intent newIntent(Context context) {
                return MenuActivity.newIntent(context, new ButtonTransition[]{
                        new ButtonTransition("Word", Transition.MENU_GRAMMAR),
                        new ButtonTransition("TEXT", Transition.TEXT),
                });
            }
        },
        TEXT {
            @Override
            public Intent newIntent(Context context) {
                return Texti.newInstance(context);
            }
        };

        public abstract Intent newIntent(Context context);
    }
}
