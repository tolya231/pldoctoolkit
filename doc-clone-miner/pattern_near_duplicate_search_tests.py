#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import unittest
from textwrap import dedent
import pattern_near_duplicate_search as pnds

class TestStringMethods(unittest.TestCase):
    def __init__(self, t):
        super().__init__(t)  # what is t here? =)

        self.lipsum = dedent("""
        Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's
        standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make
        a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting,
        remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing
        Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions
        of Lorem Ipsum.
        """)

        self.p = dedent("""
        @exception SWTException <ul>
        <li>ERROR_WIDGET_DISPOSED - if the receiver has been disposed</li>
        <li>ERROR_THREAD_INVALID_ACCESS - if not called from the thread that created the receiver</li>
        </ul>
        """)
        self.d = self.lipsum + self.p + self.lipsum + self.p + self.lipsum

        self.p = self.p.strip()
        self.sim = 0.77

    def test_1_smoke_search_spl(self):
        d = "w1 w2 w3 w4 w5 \n A B C D E1 F G H I w6 w7 \n w8 w9 A B C \n D E2 F G H I \n w10 w11 w12 w13"
        p = "A B C D E1 F G H I"
        fnds = pnds.search(d, p, self.sim, optimize_size=False)
        for fb,fe in fnds:
            print("<<<" + d[fb:fe] + ">>>")

    def test_smoke_fit_word_borders(self):
        pnds.get_fit_word_borders(self.d)

    def test_smoke_non_opt_search(self):
        pnds.search(self.d, self.p, self.sim, optimize_size=False)

    def test_smoke_search_p(self):
        fnds = pnds.search(self.d, self.p, self.sim)
        for fb,fe in fnds:
            print("<<<" + self.d[fb:fe] + ">>>")

if __name__ == '__main__':
    unittest.main()
