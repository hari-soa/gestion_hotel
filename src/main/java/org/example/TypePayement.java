package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class TypePayement {
    private float cash;
    private Mobile mobile;
    private Bancaire bancaire;
}
