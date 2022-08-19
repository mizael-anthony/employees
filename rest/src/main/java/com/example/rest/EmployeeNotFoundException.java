package com.example.rest;

class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id) {
      super("Employé non trouvé " + id);
    }
  }