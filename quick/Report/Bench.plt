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



plot "benchi.dat" u 1:2 w linespoints  title "LinkedList", \
     "benchi.dat" u 1:3 w linespoints  title "Array", \
     x*log(x) title "nlog(n)"


set output
set term pop

     

