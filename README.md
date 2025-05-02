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
![Image](https://github.com/user-attachments/assets/509206db-f44e-4e05-b1a4-21c2fbb3c051)


Implementation – 
Made a ISIN Generator class with Unit tests to generate the ISIN string.

Made Callable class with Unit test to generate one line of certificate update

Generating random numbers 

        ThreadLocalRandom random = ThreadLocalRandom.current();
Use the App main class to
Take 2 parameters: (a) Number of threads, and (b) Number of certificate updates
According to the parameters, trigger the certificate generations in multi-threads, and
Finally, collected and printed the lines of generated certificate updates
