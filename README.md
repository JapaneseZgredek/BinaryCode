# BinaryCode
English alphabet has 26 letters
That means that we need at least 5 bits (2^5=32) to encode every letter. If we assume that 'A'=1,'B'=2,...,'Z'=31, on one int variable we can encode 6 letters and still have 2 
unused bits
For example:
int n = 278905354; / 0b00_01000_01001_11111_10000_10000_01010;
Should result in message:
HI_PPJ
Because:
01000 -> 8 -> H
01001 -> 9 -> I
11111 -> 31 -> _
10000 -> 16 -> P
10000 -> 16 -> P
01010 -> 10 -> J
