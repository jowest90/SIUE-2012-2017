# ############################################################### #
# Test2.ASM                                                       #
#                                                                 #
# Sample assembly code No. 2 for testing SPIM Simulator.          #
# This sample program is just for understanding SPIM assebmbler.  #
#                                                                 #
# ############################################################### #   


.data

STR_MESSAGE: .asciiz "Hello World!"

.text
.globl main

main:    li $v0, 4               # system call #4 (print message)
         la $a0, STR_MESSAGE     # load the memory sddress of the
                                 # first character in the message

         syscall		 # Do it!

         jr $31                  # stop the program

# END OF THE LINES ###############################################
