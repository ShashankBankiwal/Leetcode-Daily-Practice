<h2><a href="https://leetcode.com/problems/utf-8-validation/">393. UTF-8 Validation</a></h2><h3>Medium</h3><hr><div><p><nr-sentence class="nr-s0" id="nr-s0" page="0">Given an integer array </nr-sentence><code><nr-sentence class="nr-s0" id="nr-s0" page="0">data</nr-sentence></code><nr-sentence class="nr-s0" id="nr-s0" page="0"> representing the data, return whether it is a valid </nr-sentence><strong><nr-sentence class="nr-s0" id="nr-s0" page="0">UTF-8</nr-sentence></strong><nr-sentence class="nr-s0" id="nr-s0" page="0"> encoding (i.e. it translates to a sequence of valid UTF-8 encoded characters).</nr-sentence></p>

<p><nr-sentence class="nr-s1" id="nr-s1" page="0">A character in </nr-sentence><strong><nr-sentence class="nr-s1" id="nr-s1" page="0">UTF8</nr-sentence></strong><nr-sentence class="nr-s1" id="nr-s1" page="0"> can be from </nr-sentence><strong><nr-sentence class="nr-s1" id="nr-s1" page="0">1 to 4 bytes</nr-sentence></strong><nr-sentence class="nr-s1" id="nr-s1" page="0"> long, subjected to the following rules:</nr-sentence></p>

<ol>
	<li><nr-sentence class="nr-s2" id="nr-s2" page="0">For a </nr-sentence><strong><nr-sentence class="nr-s2" id="nr-s2" page="0">1-byte</nr-sentence></strong><nr-sentence class="nr-s2" id="nr-s2" page="0"> character, the first bit is a </nr-sentence><code><nr-sentence class="nr-s2" id="nr-s2" page="0">0</nr-sentence></code><nr-sentence class="nr-s2" id="nr-s2" page="0">, followed by its Unicode code.</nr-sentence></li>
	<li><nr-sentence class="nr-s3" id="nr-s3" page="0">For an </nr-sentence><strong><nr-sentence class="nr-s3" id="nr-s3" page="0">n-bytes</nr-sentence></strong><nr-sentence class="nr-s3" id="nr-s3" page="0"> character, the first </nr-sentence><code><nr-sentence class="nr-s3" id="nr-s3" page="0">n</nr-sentence></code><nr-sentence class="nr-s3" id="nr-s3" page="0"> bits are all one's, the </nr-sentence><code><nr-sentence class="nr-s3" id="nr-s3" page="0">n + 1</nr-sentence></code><nr-sentence class="nr-s3" id="nr-s3" page="0"> bit is </nr-sentence><code><nr-sentence class="nr-s3" id="nr-s3" page="0">0</nr-sentence></code><nr-sentence class="nr-s3" id="nr-s3" page="0">, followed by </nr-sentence><code><nr-sentence class="nr-s3" id="nr-s3" page="0">n - 1</nr-sentence></code><nr-sentence class="nr-s3" id="nr-s3" page="0"> bytes with the most significant </nr-sentence><code><nr-sentence class="nr-s3" id="nr-s3" page="0">2</nr-sentence></code><nr-sentence class="nr-s3" id="nr-s3" page="0"> bits being </nr-sentence><code><nr-sentence class="nr-s3" id="nr-s3" page="0">10</nr-sentence></code><nr-sentence class="nr-s3" id="nr-s3" page="0">.</nr-sentence></li>
</ol>

<p><nr-sentence class="nr-s4" id="nr-s4" page="0">This is how the UTF-8 encoding would work:</nr-sentence></p>

<pre><nr-sentence class="nr-s5" id="nr-s5" page="0">     Number of Bytes   |        UTF-8 Octet Sequence
                       |              (binary)
   --------------------+-----------------------------------------
            1          |   0xxxxxxx
            2          |   110xxxxx 10xxxxxx
            3          |   1110xxxx 10xxxxxx 10xxxxxx
            4          |   11110xxx 10xxxxxx 10xxxxxx 10xxxxxx</nr-sentence>
</pre>

<p><code><nr-sentence class="nr-s6" id="nr-s6" page="0">x</nr-sentence></code><nr-sentence class="nr-s6" id="nr-s6" page="0"> denotes a bit in the binary form of a byte that may be either </nr-sentence><code><nr-sentence class="nr-s6" id="nr-s6" page="0">0</nr-sentence></code><nr-sentence class="nr-s6" id="nr-s6" page="0"> or </nr-sentence><code>1</code>.</p>

<p><strong><nr-sentence class="nr-s7" id="nr-s7" page="0">Note: </nr-sentence></strong><nr-sentence class="nr-s7" id="nr-s7" page="0">The input is an array of integers.</nr-sentence><nr-sentence class="nr-s8" id="nr-s8" page="0"> Only the </nr-sentence><strong><nr-sentence class="nr-s8" id="nr-s8" page="0">least significant 8 bits</nr-sentence></strong><nr-sentence class="nr-s8" id="nr-s8" page="0"> of each integer is used to store the data.</nr-sentence><nr-sentence class="nr-s9" id="nr-s9" page="0"> This means each integer represents only 1 byte of data.</nr-sentence></p>

<p>&nbsp;</p>
<p><strong><nr-sentence class="nr-s10" id="nr-s10" page="0">Example 1:</nr-sentence></strong></p>

<pre><strong><nr-sentence class="nr-selected-post nr-s11" id="nr-s11" page="0">Input:</nr-sentence></strong><nr-sentence class="nr-selected-post nr-s12" id="nr-s12" page="0"> data = [197,130,1]</nr-sentence>
<strong><nr-sentence class="nr-selected-post nr-s13" id="nr-s13" page="0">Output:</nr-sentence></strong><nr-sentence class="nr-selected-post nr-s14" id="nr-s14" page="0"> true</nr-sentence>
<strong><nr-sentence class="nr-selected-post nr-s15" id="nr-s15" page="0">Explanation:</nr-sentence></strong><nr-sentence class="nr-selected-post nr-s16" id="nr-s16" page="0"> data represents the octet sequence: 11000101 10000010 00000001.</nr-sentence><nr-sentence class="nr-selected-post nr-s17" id="nr-s17" page="0">
It is a valid utf-8 encoding for a 2-bytes character followed by a 1-byte character.</nr-sentence>
</pre>

<p><strong><nr-sentence class="nr-s18" id="nr-s18" page="0">Example 2:</nr-sentence></strong></p>

<pre><strong><nr-sentence class="nr-s19" id="nr-s19" page="0">Input:</nr-sentence></strong><nr-sentence class="nr-s19" id="nr-s19" page="0"> data = [235,140,4]
</nr-sentence><strong><nr-sentence class="nr-s19" id="nr-s19" page="0">Output:</nr-sentence></strong><nr-sentence class="nr-s19" id="nr-s19" page="0"> false
</nr-sentence><strong><nr-sentence class="nr-s19" id="nr-s19" page="0">Explanation:</nr-sentence></strong><nr-sentence class="nr-s19" id="nr-s19" page="0"> data represented the octet sequence: 11101011 10001100 00000100.</nr-sentence><nr-sentence class="nr-s20" id="nr-s20" page="0">
The first 3 bits are all one's and the 4th bit is 0 means it is a 3-bytes character.</nr-sentence><nr-sentence class="nr-s21" id="nr-s21" page="0">
The next byte is a continuation byte which starts with 10 and that's correct.</nr-sentence><nr-sentence class="nr-s22" id="nr-s22" page="0">
But the second continuation byte does not start with 10, so it is invalid.</nr-sentence>
</pre>

<p>&nbsp;</p>
<p><strong><nr-sentence class="nr-s23" id="nr-s23" page="0">Constraints:</nr-sentence></strong></p>

<ul>
	<li><code>1 &lt;= data.length &lt;= 2 * 10<sup>4</sup></code></li>
	<li><code>0 &lt;= data[i] &lt;= 255</code></li>
</ul>
</div>