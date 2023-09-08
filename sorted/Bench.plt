
set terminal epslatex color colortext
set output "duplicates.tex"

set termoption enhanced

set key left center
set datafile missing NaN


set xlabel "n"
    
set ylabel "time in {/Symbol m}s"

set logscale


plot "bench.dat" u 1:2 w linespoints  title "linear", \
     "bench.dat" u 1:3 w linespoints  title "binary", \
     "bench.dat" u 1:4 w linespoints  title "special", \
     

