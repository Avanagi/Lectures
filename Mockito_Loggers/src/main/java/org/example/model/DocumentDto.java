package org.example.model;

import java.util.Objects;

public class DocumentDto {

    private String documentNumber;

    public DocumentDto(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    @Override
    public String toString() {
        return "DocumentDto{" +
                "documentNumber='" + documentNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentDto that = (DocumentDto) o;
        return Objects.equals(documentNumber, that.documentNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(documentNumber);
    }
}
