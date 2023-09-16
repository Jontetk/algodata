

set terminal epslatex color colortext
set output "disp.tex"

set termoption enhanced
set encoding utf8
set key left center
set datafile missing NaN


set xlabel "n"
    
set ylabel "time in µs"
set logscale




plot "benchiiii.dat" u 1:2 w linespoints  title "Selection", \
     "benchiiii.dat" u 1:3 w linespoints  title "Insertion", \
     "benchiiii.dat" u 1:4 w linespoints  title "Merge", \
     "benchiiii.dat" u 1:5 w linespoints  title "Merge(alt)", \
     x*log(x) title "nlog(n)", \
     x*x title "n*n"

 


     

