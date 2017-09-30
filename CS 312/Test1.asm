# ############################################################### #
# Test1.ASM                                                       #
#                                                                 #
# Sample assembly code No. 2 for testing SPIM Simulator.          #
# This sample program is just for understanding SPIM assebmbler.  #
#                                                                 #
# ############################################################### #   


.data
         STR_FIRSTNUM: .asciiz "Please enter the first number: "

.text
.globl main

main:    li $s1, 1		# load constant "1" to register $S1

         li $s2, 2		# load constant "2" to register $S1
         
         add $s0, $s1, $s2	# add register S1 and S2

         jr $31                  # Return from main (stop the program)

# END OF THE LINES ###############################################
