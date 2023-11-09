package com.example.Techcompany.Model;

import java.time.LocalDateTime;

public class FormField {

   
    private Long id;
    private String name;
    private String label;

    private String type;

    private String placeholder;
    private boolean required;

   // @Column(columnDefinition = "jsonb")
    private String options;

    private LocalDateTime createdAt;
    
    private LocalDateTime updatedAt;

    // Constructors, getters, and setters

    // Default constructor
    public FormField() {
    }

    // Parameterized constructor
    public FormField(String name, String label, String type, String placeholder, boolean required, String options) {
        this.name = name;
        this.label = label;
        this.type = type;
        this.placeholder = placeholder;
        this.required = required;
        this.options = options;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "FormField [id=" + id + ", name=" + name + ", label=" + label + ", type=" + type + ", placeholder="
				+ placeholder + ", required=" + required + ", options=" + options + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}

    
    
}

