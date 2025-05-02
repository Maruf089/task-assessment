# task-assessment
This project generates financial certificate updates with the following properties:

Timestamp (milliseconds since epoch)

ISIN 

Bid Price (100.00-200.00)

Bid Size (1,000-5,000)

Ask Price (100.00-200.00)

Ask Size (1,000-10,000)

Maturity Date (within next 2 years)

## Project Structure
src/
├── main/
│   ├── java/
│   │   ├── App.java                    # Main application class
│   │   ├── CertificateUpdate.java      # Data model
│   │   ├── CertificateUpdateCallable.java # Callable generator
│   │   ├── CertificateUpdateGenerator.java 
│   │   └── ISINGenerator.java          # ISIN generation
│   └── resources/
└── test/
    ├── java/                           # Unit tests
