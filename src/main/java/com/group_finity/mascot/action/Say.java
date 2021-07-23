package com.group_finity.mascot.action;

import java.util.List;

import com.group_finity.mascot.animation.Animation;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;
import com.group_finity.mascot.script.VariableMap;

/**
 * @author hundun
 * Created on 2021/07/23
 */
public class Say extends InstantAction {

    public static final String PARAMETER_SAY_TEXT = "SayText";
    
    public Say(VariableMap context) {
        super(context);
    }

    @Override
    protected void apply() throws VariableException {
        System.out.println(eval(PARAMETER_SAY_TEXT, String.class, "Hello world!"));
    }



}
