# Student Hostel Management Program - README

## Overview

During the Fall 2020 semester at Queensborough Community College, a student hostel management program was developed to meet the requirements of the university. This program efficiently manages a student hostel, keeping track of tenants, room occupancy, and monthly rent payments.

## Project Details

- **Purpose**: Manage a student hostel with multiple rooms, each occupied by a single tenant who pays rent monthly.
- **Information Tracked**: Tenant name, room number, and a list of monthly payments made by the tenant.
- **Functionalities**:
  - Add and delete tenants.
  - Display a list of all tenants.
  - Record monthly payments for a specific tenant.
  - Display payment history for a tenant.

## Development Process

### 1. Analysis and Specification

- Determined system requirements through analysis.
- Documented specifications in an unambiguous manner.

### 2. Design

- Designed an efficient system architecture using Unified Modeling Language (UML) notation.
- Collaborated with Professor Steven Trowbridge to finalize the design.

### 3. Implementation

- Implemented the design into a functional program using Java.
- Utilized JavaDoc to document code for better understanding.

### 4. Testing

- Rigorously tested the program to ensure accurate implementation.
- Maintained a detailed test log for tracking and documentation.
- Conducted unit tests and integration testing.

### 5. Installation

- Delivered and set up the completed system for practical use.

## Components

The project consists of the following key components:

1. **Tenant Class (Tenant.java)**
   - Represents a tenant with attributes such as name, room number, and payment history.

2. **TenantList Class (TenantList.java)**
   - Manages a list of tenants, providing functionalities like adding, removing, searching, and displaying tenants.

3. **Hostel Class (Hostel.java)**
   - Main application class implementing the JavaFX framework for user interface.
   - Handles user interactions, such as adding and removing tenants, recording payments, and displaying tenant information.

4. **Payment Class (Payment.java)**
   - Represents a payment made by a tenant, including details like month and amount.

5. **PaymentList Class (PaymentList.java)**
   - Manages a list of payments for a tenant, offering functionalities like adding, removing, and calculating total payments.

## Contributions

- Collaborated closely with Professor Steven Trowbridge to define requirements and design the system.
- Solely responsible for the implementation, testing, and documentation phases.
- Ensured that the final program met the university's unique requirements precisely.

## How to Run

1. Ensure you have Java installed on your system.
2. Compile and run the `Hostel.java` file to launch the program.
3. Follow the on-screen instructions to interact with the hostel management system.

## Acknowledgments

Special thanks to Professor Steven Trowbridge for providing guidance and mentorship throughout the development process.

Feel free to reach out for any inquiries or further assistance.
