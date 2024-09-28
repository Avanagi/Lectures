package org.example.model;

import java.util.HashMap;
import java.util.Objects;

public class UserDto {

    private String name;
    private Long id;
    private HashMap<Long, DocumentDto> documents;

    public UserDto(String name, HashMap<Long, DocumentDto> documents) {
        this.name = name;
        this.documents = documents;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", documents=" + documents +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return Objects.equals(name, userDto.name) && Objects.equals(documents, userDto.documents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, documents);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Long, DocumentDto> getDocuments() {
        return documents;
    }

    public void setDocuments(HashMap<Long, DocumentDto> documents) {
        this.documents = documents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
