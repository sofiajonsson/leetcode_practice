def reverse(x)
     x_rev_signed = x > 0 ? "" : "-"
    x_rev = (x_rev_signed + x.to_s.split("-").last.reverse).to_i
    x_rev.bit_length > 31 ? 0 : x_rev
end
