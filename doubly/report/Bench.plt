reset
set term push
set terminal epslatex color colortext
set output "disp.tex"

set termoption enhanced
set encoding utf8
set key left center
set datafile missing NaN


set xlabel "n"
    
set ylabel "time in µs"

set logscale

set key left top
set xrange [500:500000]


plot "benchdoub.dat" u 1:2 w linespoints  title "Double linked list", \
     "benchdoub.dat" u 1:3 w linespoints  title "Single linked list", \
     x title "n"

set output
set term pop

     

