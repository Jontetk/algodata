

set terminal epslatex color colortext
set output "duplicatestes.tex"

set termoption enhanced
set encoding utf8
set key left center
set datafile missing NaN


set xlabel "n"
    
set ylabel "time in µs"
set logscale




plot "benchdupli.dat" u 1:2 w linespoints  title "linear", \
     "benchdupli.dat" u 1:3 w linespoints  title "binary", \
     "benchdupli.dat" u 1:4 w linespoints  title "pointer"


     

