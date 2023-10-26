# Hashing Algorithms

Practices with Hashing algorithms developed to store and authenticate keys securely, with SHA-512, Salting and HMAC.

## What is Hashing?

Hashing is a process of transforming data into a fixed alphanumeric character sequence called a "hash." This hash is calculated from the original data using a specific algorithm. The purpose of hashing is to create a unique and fixed representation of the data, making it possible to verify if the data has been altered. However, hashing algorithms are non-reversible, meaning it is not possible to obtain the original data from the hash.

### SHA (Secure Hash Algorithm):
SHA is a family of widely used hashing algorithms. SHA-1, SHA-256, SHA-512, and so on are examples of different variants of the SHA algorithm. They produce hashes of various sizes and are widely employed to ensure data integrity and authentication.

An alphanumeric sequence with a one-way hash in SHA-512 has 128 hexadecimal characters, with <abbr title="13407807929942597099574024998205846127479365820592393377723561443721764030073546976801874298166903427690031858186486050853753882811946569946433649006084096">2<sup>512</sup></abbr> different combinations. Therefore, with current technology, there is no computing power in the world capable of deciphering this summary using brute force.

### Salting:
Salting is a technique used to enhance hash security. It involves adding a random value (the "salt") to the data before calculating the hash. This means that even if two sets of data have the same content, they will have different hashes due to the salt. The salt makes it more difficult for attackers to use rainbow tables to break hashes, enhancing data security.

### HMAC (Hash-based Message Authentication Code):
HMAC is a construction that combines a secret key with a hashing algorithm, usually SHA, to create a message authentication code. It is used to verify the integrity and authenticity of data. HMAC is widely employed in security systems, such as network authentication and message integrity verification.

## Conclusion

The utility of these concepts is related to data security. They play a critical role in protecting information, ensuring that data is not tampered with and that transactions are authentic. For example, hashing is used to securely store passwords, ensuring they cannot be retrieved from the hashes, making brute-force attacks almost impossible. HMAC is crucial for data authentication and integrity in communication systems. Therefore, these concepts play a critical role in safeguarding information in an increasingly digital and interconnected world.