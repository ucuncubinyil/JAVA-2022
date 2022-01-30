package com.company.iciceornek1;

import com.company.iciceornek1.interfaces.Nested;

public class Yazdir implements Nested.Gel {

    @Override
    public void goster() {
        System.out.println("Java iç içe interface örneğim");
    }
}
